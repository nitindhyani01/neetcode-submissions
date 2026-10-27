class Solution {
    static class Visit {
        String username;
        int timestamp;
        String website;

        Visit(String username, int timestamp, String website) {
            this.username = username;
            this.timestamp = timestamp;
            this.website = website;
        }
    }
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        int n = username.length;
        List<Visit> visits = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            visits.add(new Visit(username[i], timestamp[i], website[i]));
        }
        visits.sort(Comparator.comparingInt(a -> a.timestamp));
        Map<String, List<String>> userWebsites = new HashMap<>();
        for (Visit v : visits) {
            userWebsites.computeIfAbsent(v.username, k -> new ArrayList<>()).add(v.website);
        }
        Map<String, Integer> patternCount = new HashMap<>();
        String bestPatternKey = "";
        int maxScore = 0;

        for (List<String> list : userWebsites.values()) {
            if (list.size() < 3) continue;

            Set<String> uniquePatterns = new HashSet<>();
            int size = list.size();

            for (int i = 0; i < size - 2; i++) {
                for (int j = i + 1; j < size - 1; j++) {
                    for (int k = j + 1; k < size; k++) {
                        String pattern = list.get(i) + " " + list.get(j) + " " + list.get(k);
                        uniquePatterns.add(pattern);
                    }
                }
            }

            for (String pattern : uniquePatterns) {
                int count = patternCount.getOrDefault(pattern, 0) + 1;
                patternCount.put(pattern, count);

                if (count > maxScore || (count == maxScore && pattern.compareTo(bestPatternKey) < 0)) {
                    maxScore = count;
                    bestPatternKey = pattern;
                }
            }
        }
        return Arrays.asList(bestPatternKey.split(" "));
    }
}