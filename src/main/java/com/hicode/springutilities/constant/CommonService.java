package com.hicode.springutilities.constant;


import java.util.List;

/**
 *
 * @param <DTO>
 * @param <ID>
 * @param <REQ>
 */
public interface CommonService<DTO, ID, REQ> {
    public List<DTO> getList();

    public DTO getOne(ID id);

    public DTO save(REQ body);

    public void delete(ID id);
}
