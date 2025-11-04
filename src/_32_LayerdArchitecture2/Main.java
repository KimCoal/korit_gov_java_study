package _32_LayerdArchitecture2;

import _32_LayerdArchitecture2.dto.SignUpReqDto;
import _32_LayerdArchitecture2.service.SignUpService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SignUpService signUpService = SignUpService.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("[회원관리 시스템]");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 가입된 회원 전체 조회");
            System.out.println("q. 종료");
            System.out.print(">>> ");
            String selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료.");
                break;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("[ 회원가입 ]");
                SignUpReqDto signUpReqDto = new SignUpReqDto();
                // 아이디 중복확인
                while (true) {
                    System.out.print("Username : ");
                    signUpReqDto.setUsername(scanner.nextLine());
                    if (signUpService.isValidDuplicatedUsername(signUpReqDto.getUsername())) {
                        break;
                    }
                    System.out.println("이미 사용중인 Username입니다.");
                }
                // 비밀번호 유효성 체크
                while (true) {
                    System.out.print("Password : ");
                    signUpReqDto.setPassword(scanner.nextLine());
                    if (signUpService.isValidPassword(signUpReqDto.getPassword())) {
                        break;
                    }
                    System.out.println("비밀번호가 유효하지 않습니다");
                }
                // 비밀번호와 비밀번호 확인이 같은지 체크
                while (true) {
                    System.out.print("ConfirmPassword : ");
                    signUpReqDto.setConfirmPassword(scanner.nextLine());
                    if (signUpService.isValidConfirmPassword(signUpReqDto.getPassword(), signUpReqDto.getConfirmPassword())) {
                        break;
                    }
                    System.out.println("비밀번호가 일치하지 않습니다");
                }
                signUpService.signup(signUpReqDto);
            } else if ("2".equals(selectedMenu)) {
                System.out.println("[ 로그인 ]");
            } else if ("3".equals(selectedMenu)) {
                System.out.println("[ 가입된 회원 전체 조회 ]");
            } else {
                System.out.println("메뉴를 다시 선택해주세요.");
            }
        }
        System.out.println("프로그램 종료 완료");
    }
}
