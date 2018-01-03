package com.nilsson83gmail.linus.workout;

/**
 * Created by Linus on 2017-12-27.
 */

public class Workout {

    private String name;
    private String description;

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand push-ups\n10 1-legged sqiuats\n15 Pull-ups"),
            new Workout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100Squats"),
            new Workout("The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
