package ${package.ServiceImpl};

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ${package.Entity}.${entity};
import ${package.Controller}.${entity}Dto;
import ${package.Mapper}.${entity}Mapper;
import ${package.Service}.${table.serviceName};
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service
public class ${table.serviceImplName} extends ServiceImpl<${entity}Mapper, ${entity}> implements ${table.serviceName} {

    @Override
    public boolean insertSelective(${entity} ${entity?uncap_first}) {
        return retBool(baseMapper.insert(${entity?uncap_first}));
    }

    @Override
    public boolean deleteByPrimaryKey(String key) {
        return retBool(baseMapper.deleteById(key));
    }

    @Override
    public boolean updateByPrimaryKeySelective(${entity} ${entity?uncap_first}) {
        return retBool(baseMapper.updateById(${entity?uncap_first}));
    }

    @Override
    public ${entity} selectByPrimaryKey(String key) {
        return baseMapper.selectById(key);
    }

    @Override
    public List<${entity}> getList(${entity}Dto dto) {
        QueryWrapper qw = new QueryWrapper();
        Map<String, Object> map = new HashMap<String, Object>();
        qw.allEq(map, false);
        List<${entity}> list = baseMapper.selectList(qw);
        return list;
    }

    @Override
    public List<${entity}> getListAll() {
        return baseMapper.selectList(null);
    }

}
