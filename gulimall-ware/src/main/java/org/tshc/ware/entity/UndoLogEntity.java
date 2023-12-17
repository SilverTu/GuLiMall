package org.tshc.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:47:24
 */
@Data
@Accessors(chain = true)
@TableName("undo_log")
public class UndoLogEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   *
   */
  @TableId
  private Long id;
  /**
   *
   */
  private Long branchId;
  /**
   *
   */
  private String xid;
  /**
   *
   */
  private String context;
  /**
   *
   */
  private String rollbackInfo;
  /**
   *
   */
  private Integer logStatus;
  /**
   *
   */
  private Date logCreated;
  /**
   *
   */
  private Date logModified;
  /**
   *
   */
  private String ext;

}
