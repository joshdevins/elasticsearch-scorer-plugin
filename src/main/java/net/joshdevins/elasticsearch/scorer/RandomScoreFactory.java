package net.joshdevins.elasticsearch.scorer;

import java.util.Map;
import java.util.Random;

import org.elasticsearch.common.Nullable;
import org.elasticsearch.script.AbstractDoubleSearchScript;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;

/**
 * Scores by a random value.
 */
public final class RandomScoreFactory implements NativeScriptFactory {

    static private Random RND = new Random(System.currentTimeMillis());

    @Override
    public ExecutableScript newScript(@Nullable Map<String, Object> params) {
        return new AbstractDoubleSearchScript() {

            @Override
            public double runAsDouble() {
                return RND.nextDouble();
            }
        };
    }

}
