package CodeTest;

import java.util.*;

public class Solution {

    /*중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
    예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
    정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.*/
    public int solution01(int[] array) {

        int answer;

        // 오름차순 정렬
        Arrays.sort(array);

        // i 값에 배열의 가운데 인덱스번호를 입력
        int i = (array.length / 2);
        answer = array[i];
        return answer;
    }

    /*머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
    구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.*/
    public int solution02(int price) {
        int answer;

        if (price >= 100000 && price < 300000) {
            answer = (int)(price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            answer = (int)(price * 0.9);
        } else if (price >= 500000) {
            answer = (int)(price * 0.8);
        } else {
            answer = price;
        }

        return answer;
    }

    /*정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
    array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.*/
    public int solution03(int[] array, int n) {
        int answer = 0;

        for (int num : array) {
            if (num == n)
                answer++;
        }

        return answer;
    }

    /*정수 배열 numbers가 매개변수로 주어집니다.
    numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.*/
    public int[] solution04(int[] numbers) {
        int[] newNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i] * 2;
        }
        return newNumbers;
    }

    /*정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
    배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.*/

    public int[] solution05(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
        } else if (direction.equals("left")) {
            answer[numbers.length - 1] = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
        }
        return answer;
    }

    /*가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
    rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.*/
    public String solution06(String rsp) {
        // 2 < 0 < 5 < 2
        StringBuilder sb = new StringBuilder();
        char[] charArray = rsp.toCharArray();
        for (char c : charArray) {
            if (c == '2') sb.append('0');
            if (c == '0') sb.append('5');
            if (c == '5') sb.append('2');
        }
        return sb.toString();
    }

    /*개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
    장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
    예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
    장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다. 사냥감의 체력 hp가 매개변수로 주어질 때,
    사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
     */

    public int solution07(int hp) {
        int genAnt = hp / 5;

        int leftHp = hp % 5;

        int solAnt = leftHp / 3;

        int leftHpAfterSolAnt = leftHp % 3;

        int workAnt = leftHpAfterSolAnt;

        return genAnt + solAnt + workAnt;

    }

    /*머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
    조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
    문자열 배열 babbling이 매개변수로 주어질 때,
    머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.*/

    public int solution08(String[] babbling) {
//        "ayaye", "uuuma", "ye", "yemawoo", "ayaa"

        int count = 0;

        String[] canBab = {"aya", "ye", "woo", "ma"};

        for (String bab : babbling){
            for (int i = 0; i < canBab.length; i++) {
                bab = bab.replace(canBab[i], " ");
            }
//            bab = bab.replace("aya", " ")
//                    .replace("ye", " ")
//                    .replace("woo", " ")
//                    .replace("ma", " ");
            if (bab.trim().equals(""))
//            만약 replacement를 ""이 아닌 " "로 대입했을때는 ayaye같은 문자열이 오면 공백 2칸으로 인식하기 때문에
//            trim()을 써서 공백을 없애준다음 if문으로 검사를 해주는게 좋다
                count++;
        }

        return count;

    }

    public static void main(String[] args) {
        Solution s = new Solution();

        // solution01
        int[] array = {1, 2, 3, 4, 5};
        int result01 = s.solution01(array);
        System.out.println(result01);

        // solution02
        int price = 700000;
        int result02 = s.solution02(price);
        System.out.println(result02);

        // solution03
        int[] Array03 = {1,1,3,3,3,4,5,6,6,6,7,8,8,8,9};
        int result03 = s.solution03(Array03, 1);
        System.out.println(result03);

        // solution04
        int[] Array04 = {1,2,3,4,5,6,7};
        int[] result04 = s.solution04(Array04);
        System.out.println(Arrays.toString(result04));

        // solution05
        int[] Array05 = {1,2,3,4,5,6,7,8,9,10};
        int[] result05 = s.solution05(Array05, "right");
        System.out.println(Arrays.toString(result05));

        // solution06
        String rsp = "025";
        String result06 = s.solution06(rsp);
        System.out.println(result06);

        // solution07
        int hp = 23231233;
        int result07 = s.solution07(hp);
        System.out.println(result07);

        // solution08
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        int result08 = s.solution08(babbling);
        System.out.println(result08);


    }
}
