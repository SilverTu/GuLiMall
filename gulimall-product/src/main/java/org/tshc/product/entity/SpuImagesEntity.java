package org.tshc.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * spu图片
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@Data
@Accessors(chain = true)
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * spu_id
   */
  private Long spuId;
  /**
   * 图片名
   */
  private String imgName;
  /**
   * 图片地址
   */
  private String imgUrl;
  /**
   * 顺序
   */
  private Integer imgSort;
  /**
   * 是否默认图
   */
  private Integer defaultImg;

}
