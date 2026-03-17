package graph.p0207_course_schedule;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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

        for (int i = 0; i < numCourses; i++) {
            if (courseDependsOn[i] == 0) {
                canBeCompletedQueue.offer(i);
            }
        }

        int processedCourses = 0;

        while (!canBeCompletedQueue.isEmpty()) {
            int currCourse = canBeCompletedQueue.poll();
            processedCourses++;

            for (int course : graph.get(currCourse)) {
                courseDependsOn[course]--;

                if (courseDependsOn[course] == 0) {
                    canBeCompletedQueue.offer(course);
                }
            }
        }

        return numCourses == processedCourses;
    }
}
