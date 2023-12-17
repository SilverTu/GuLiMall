package org.tshc.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * spu信息介绍
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@Data
@Accessors(chain = true)
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 商品id
   */
  @TableId
  private Long spuId;
  /**
   * 商品介绍
   */
  private String decript;

}
