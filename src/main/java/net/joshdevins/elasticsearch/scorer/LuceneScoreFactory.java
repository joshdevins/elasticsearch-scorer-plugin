package net.joshdevins.elasticsearch.scorer;

import java.util.Map;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.AbstractFloatSearchScript;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

/**
 * A scorer that returns just the Lucene score directly.
 */
public final class LuceneScoreFactory implements NativeScriptFactory {

    @Override
    public ExecutableScript newScript(@Nullable Map<String, Object> params) {
        return new AbstractFloatSearchScript() {

            @Override
            public float runAsFloat() {
                return score();
            }
        };
    }

}
