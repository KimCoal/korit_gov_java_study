package _32_LayerdArchitecture2.service;

import _32_LayerdArchitecture2.dto.SignInReqDto;

public interface SignInService {
    void signin(SignInReqDto signinReqDto);
    boolean isEmpty(String str);
}
