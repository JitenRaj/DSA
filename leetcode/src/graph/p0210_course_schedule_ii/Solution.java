package graph.p0210_course_schedule_ii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] courseDependsOn = new int[numCourses];

        for (int[] pre : prerequisites) {
            int course = pre[0];
            int preReq = pre[1];

            graph.get(preReq).add(course);
            courseDependsOn[course]++;
        }

        Queue<Integer> canBeCompletedQueue = new LinkedList<>();

        for (int course = 0; course < numCourses; course++) {
            if (courseDependsOn[course] == 0) {
                canBeCompletedQueue.offer(course);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        while (!canBeCompletedQueue.isEmpty()) {
            int currCourse = canBeCompletedQueue.poll();

            result[index++] = currCourse;

            for (int course : graph.get(currCourse)) {
                courseDependsOn[course]--;

                if (courseDependsOn[course] == 0) {
                    canBeCompletedQueue.offer(course);
                }
            }
        }

        if (index != numCourses) return new int[] {};

        return result;
    }
}
