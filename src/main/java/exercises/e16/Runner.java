package exercises.e16;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum Runner {
    BEGINNER(11, 15),
    INTERMEDIATE(8, 10),
    ADVANCED(4, 7);

    final private Integer minimumTime;
    final private Integer maximumTime;

    public static Runner getFitnessLevel(Integer time) {
        return Arrays.stream(Runner.values())
                .filter(runner -> runner.minimumTime <= time && runner.maximumTime >= time)
                .findFirst()
                .get();
    }
}
