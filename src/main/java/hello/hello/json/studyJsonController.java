package hello.hello.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studyJsonController {
    @GetMapping("/")
    public studyJson test() {
        studyJson studyJson = new studyJson();
        studyJson.setData("hello world");
        studyJson.setSuccess(true);

        return studyJson;
    }
}
