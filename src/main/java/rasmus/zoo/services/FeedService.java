package rasmus.zoo.services;

import org.springframework.stereotype.Service;
import rasmus.zoo.models.Employee;
import rasmus.zoo.models.Feed;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedService {

    public List<Feed> getFeed() {
        List<Feed> feed = new ArrayList<>();
        feed.add(new Feed("Lejonmat"));
        feed.add(new Feed("Ormmat"));
        return feed;
    }
}
