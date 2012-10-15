package net.joshdevins.elasticsearch.scorer;

import java.util.Map;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.AbstractDoubleSearchScript;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

/**
 * A scorer that returns just the Lucene score directly but scaled down to a small double to see
 * what effect this has (if any).
 */
public final class LuceneDownscaledScoreFactory implements NativeScriptFactory {

    @Override
    public ExecutableScript newScript(@Nullable Map<String, Object> params) {
        return new AbstractDoubleSearchScript() {

            @Override
            public double runAsDouble() {
                return score() * 0.0001d;
            }
        };
    }

}
