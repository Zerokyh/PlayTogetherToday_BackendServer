package playtotogerther.API.util;

public enum ResponseMessage {
    SUCCESS("성공했음"),
    CREATE("만들어짐"),
    BAD_REQUEST("잘못 보냈습니다.없습니다."),
    UNAUTHORIZED("누구세요"), // 인증 실패
    NOT_FOUND("없습니다."), //
    SERVER_ERROR("서버오류"),
    FAILURE("실패했음"),
    LOGIN_SUCCESS("로그인 성공"),
    LOGIN_FAILURE("로그인 실패");

    private String code;

    ResponseMessage(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode() {
        this.code = code;
    }

}
