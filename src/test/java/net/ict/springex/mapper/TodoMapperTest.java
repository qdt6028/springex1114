package net.ict.springex.mapper;

import lombok.extern.log4j.Log4j2;
import net.ict.springex.domain.TodoVO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTest {

    @Autowired(required = false)
    private TodoMapper todoMapper;
    @Test
    public void testGetTime(){
        log.info(todoMapper.getTime());
    }

    @Test
    public void testInsert(){
        TodoVO vo = TodoVO.builder()
                        .content("spring test :>")
                        .dueDate(LocalDate.of(2022,11,14))
                        .writer("denise")
                        .build();
        todoMapper.insert(vo);

    }
}
