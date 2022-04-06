package sit.int204.classicmodelsservice.utils;

import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import sit.int204.classicmodelsservice.dtos.PageDTO;

import java.util.List;
import java.util.stream.Collectors;

public class ListMapper {
    private static final ListMapper listMapper = new ListMapper();
    private ListMapper() { }
    public <S, T> List<T> mapList(List<S> source, Class<T> targetClass, ModelMapper modelMapper) {
        return source.stream().map(entity -> modelMapper.map(entity, targetClass))
                .collect(Collectors.toList());
    }
    public static ListMapper getInstance() {
        return listMapper;
    }

}
