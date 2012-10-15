package net.joshdevins.elasticsearch.scorer;

import java.util.Map;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.index.field.data.strings.StringDocFieldData;
import org.elasticsearch.script.AbstractFloatSearchScript;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

/**
 * A scorer that returns just the Lucene score directly but also throws in some other compute time
 * stuff.
 */
public final class ExtraLuceneScoreFactory implements NativeScriptFactory {

    @Override
    public ExecutableScript newScript(@Nullable Map<String, Object> params) {
        return new AbstractFloatSearchScript() {

            @Override
            public float runAsFloat() {
                Integer.parseInt(((StringDocFieldData) doc().field("_id")).getStringValue());
                return score();
            }
        };
    }

}
