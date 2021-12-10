package com.cyl.service.impl;

import com.cyl.entity.Blog;
import com.cyl.mapper.BlogMapper;
import com.cyl.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cyl
 * @since 2021-12-10
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
