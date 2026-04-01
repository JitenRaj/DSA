package stack.p2751_robot_collisions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
    class Robot {
        int pos;
        int health;
        char dir;
        int originalIndex;

        public Robot(int pos, int health, char dir, int originalIndex) {
            this.pos = pos;
            this.health = health;
            this.dir = dir;
            this.originalIndex = originalIndex;
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;

        Robot[] robots = new Robot[n];

        for (int i = 0; i < n; i++) {
            robots[i] = new Robot(positions[i], healths[i], directions.charAt(i), i);
        }

        Arrays.sort(robots, (a, b) -> Integer.compare(a.pos, b.pos));

        Stack<Robot> stack = new Stack<>();

        for (Robot currRobot : robots) {
            while (!stack.isEmpty() && currRobot.dir == 'L' && stack.peek().dir == 'R') {
                Robot topRobot = stack.peek();

                if (topRobot.health > currRobot.health) {
                    topRobot.health -= 1;
                    currRobot.health = 0;
                    break;
                } else if (topRobot.health < currRobot.health) {
                    stack.pop();
                    currRobot.health -= 1;
                } else {
                    stack.pop();
                    currRobot.health = 0;
                    break;
                }
            }

            if (currRobot.health > 0) {
                stack.push(currRobot);
            }
        }

        stack.sort((a, b) -> Integer.compare(a.originalIndex, b.originalIndex));

        List<Integer> result = new ArrayList<>();

        for (Robot robot : stack) {
            result.add(robot.health);
        }

        return result;
    }
}
