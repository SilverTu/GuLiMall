package org.tshc.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 优惠券分类关联
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
@Data
@Accessors(chain = true)
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * 优惠券id
   */
  private Long couponId;
  /**
   * 产品分类id
   */
  private Long categoryId;
  /**
   * 产品分类名称
   */
  private String categoryName;

}
