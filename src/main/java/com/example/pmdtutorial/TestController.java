package com.example.pmdtutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * <pre>
 *  설명  :
 *
 *  작성일: 2022/05/01
 *  작성자: Rick
 *
 *  수정 내역:
 *  수정자    수정일자       수정내역
 *  ------  ----------  ----------------------------
 *  2022/05/01  Rick        최초생성
 *  </pre>
 */
@RestController
public class TestController {
  @GetMapping("/test/{name}")
  public String test(@PathVariable String name) {
    return "Hello " + name;
  }
}
