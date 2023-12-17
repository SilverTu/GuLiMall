package org.tshc.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 采购信息
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:47:24
 */
@Data
@Accessors(chain = true)
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   *
   */
  @TableId
  private Long id;
  /**
   *
   */
  private Long assigneeId;
  /**
   *
   */
  private String assigneeName;
  /**
   *
   */
  private String phone;
  /**
   *
   */
  private Integer priority;
  /**
   *
   */
  private Integer status;
  /**
   *
   */
  private Long wareId;
  /**
   *
   */
  private BigDecimal amount;
  /**
   *
   */
  private Date createTime;
  /**
   *
   */
  private Date updateTime;

}
