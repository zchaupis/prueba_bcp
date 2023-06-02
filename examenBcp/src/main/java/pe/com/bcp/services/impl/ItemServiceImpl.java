package pe.com.bcp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.bcp.repository.ItemRepository;
import pe.com.bcp.repository.model.Item;
import pe.com.bcp.services.ItemService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<String> getTitles(Double rating) {
        List<Item> items = itemRepository.findItemsWithAverageRatingLowerThan(rating);
        return items.stream().map(Item::getTitle).collect(Collectors.toList());
    }
}
