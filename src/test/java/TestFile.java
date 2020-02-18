import com.baizhi.entity.FileSave;
import com.baizhi.service.FileService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class TestFile extends BasicBean {
    @Resource
    private FileService fileService;
    @Test
    public void testFile(){
        List<FileSave> all = fileService.findAll();
        all.forEach(file-> System.out.println(file));
    }
}
