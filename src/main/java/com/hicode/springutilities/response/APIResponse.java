package com.hicode.springutilities.response;

import com.hicode.springutilities.message.ResponseMessage;
import org.springframework.http.ResponseEntity;
/**
 *
 * */
public final class APIResponse {
    /**status code*/
    private Integer status;
    /**message*/
    private String message;
    /**data*/
    private Object data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public APIResponse(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    /**
     * success response
     * @param status
     * @param message
     * @param data
     * @return
     *    ResponseEntity<APIResponse>
     *    Response Body
     * */
    public  static ResponseEntity<?> ok(Integer status, String message, Object data){
        return ResponseEntity.ok(new APIResponse(status, message, data));
    }

    /**
     * success response
     *
     * @param message
     * @param data
     * @return
     *    ResponseEntity<APIResponse>
     *    Response Body
     * */
    public static ResponseEntity<?> ok(String message, Object data){
        return ResponseEntity.ok(new APIResponse(200, message, data));
    }
    /**
     * success response
     * @param data
     * @return
     *    ResponseEntity<APIResponse>
     *    Response Body
     * */
    public static ResponseEntity<?> ok(Object data){
        return ResponseEntity.ok(new APIResponse(200, ResponseMessage.SUCCESS, data));
    }

    /**
     * fail response
     * @param status
     * @param message
     * @param data
     * @return
     *    ResponseEntity<APIResponse>
     *    Response Body
     * */
    public  static ResponseEntity<?> fail(Integer status, String message, Object data){
        return ResponseEntity.ok(new APIResponse(status, message, data));
    }
    /**
     * fail response
     * @param status
     * @param message
     * @return
     *    ResponseEntity<APIResponse>
     *    Response Body
     * */
    public  static ResponseEntity<?> fail(Integer status, String message){
        return ResponseEntity.ok(new APIResponse(status, message, null));
    }

}
