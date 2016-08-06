package ee.tlu;

class Main {

    String convertWord(String word) {
//        String answer = "";
//        int counter = 1;
//        for (int i = 0; i < word.length(); i++) {
//            char currentLetter = word.charAt(i);
//            char nextLetter = 0;
//            try {
//                nextLetter = word.charAt(i + 1);
//            } catch (Exception e) {
//                System.out.println("Error: " + e);
//            }
//            boolean letterEqualsWithOneLetterBefore = currentLetter == nextLetter;
//            boolean notLastLetter = i != word.length() - 1;
//            if (letterEqualsWithOneLetterBefore && notLastLetter) {
//                counter++;
//            } else {
//                answer += counter + Character.toString(currentLetter);
//                counter = 1;
//            }
//        }
//        return answer;
        String result = "";
        StringBuilder sb = new StringBuilder(word);
        while (sb.length() != 0) {
            int count = 0;
            char test = sb.charAt(0);
            search:
            {
                while (sb.indexOf(String.valueOf(test)) != -1) {
                    if (sb.indexOf(String.valueOf(test)) > 1) {
                        break search;
                    }
                    sb.deleteCharAt(sb.indexOf(String.valueOf(test)));
                    count++;
                }
            }
            result = result + count + test;
        }
        return result;
    }
}
