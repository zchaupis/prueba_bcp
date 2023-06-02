package pe.com.bcp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.com.bcp.services.ItemService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(value = "/titles", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getTitles(@RequestParam("rating") Double rating) {
        List<String> titles = itemService.getTitles(rating);
        return ResponseEntity.ok().body(titles);
    }
}
