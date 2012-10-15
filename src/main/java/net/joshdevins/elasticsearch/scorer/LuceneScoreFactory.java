package net.joshdevins.elasticsearch.scorer;

import java.io.IOException;
import java.util.Map;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.AbstractDoubleSearchScript;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

/**
 * A scorer that returns just the Lucene score directly.
 */
public final class LuceneScoreFactory implements NativeScriptFactory {

    @Override
    public ExecutableScript newScript(@Nullable Map<String, Object> params) {
        return new AbstractDoubleSearchScript() {

            @Override
            public double runAsDouble() {
                try {
                    return doc().score();
                } catch (IOException e) {
                    return 1d;
                }
            }
        };
    }

}
