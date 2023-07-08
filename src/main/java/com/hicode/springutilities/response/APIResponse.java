package com.hicode.springutilities.response;

import com.hicode.springutilities.message.ResponseMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
/**
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public final class APIResponse {
    /**status code*/
    private Integer status;
    /**message*/
    private String message;
    /**data*/
    private Object data;
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
