package org.tshc.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 仓库信息
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:47:24
 */
@Data
@Accessors(chain = true)
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * 仓库名
   */
  private String name;
  /**
   * 仓库地址
   */
  private String address;
  /**
   * 区域编码
   */
  private String areacode;

}
