package me.adkhambek.example4;


import lombok.Builder;
import lombok.Data;
import lombok.experimental.ExtensionMethod;
import me.adkhambek.print.PrintUtil;

@ExtensionMethod({
        PrintUtil.class
})
public class Main {

    @Data
    @Builder
    static class UserInfo {
        private final String userName;
        private final String userEmail;
    }

    public static void main(String[] args) {
        UserInfo userInfo = UserInfo
                .builder()
                .userName("Adam")
                .userEmail("adam@mail.domain")
                .build();

        "title main text".toTitleCase().println();
        userInfo.toString().println();
    }
}
