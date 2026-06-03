package re.bt1.test;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public String test() {
        return "Bạn đã truy cập API được bảo vệ bằng JWT thành công!";
    }
}
