package playtotogerther.API.util;

public class ApiResponse<T> {
    private Status status;
    private Code code;
    private ResponseMessage responseMessage;
    private T data;

    public ApiResponse(Status status, Code code, ResponseMessage responseMessage, T data) {
        this.status = status;
        this.code = code;
        this.responseMessage = responseMessage;
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
