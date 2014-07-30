package lang;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestMapping;


public interface LangPopularRepository extends
		PagingAndSortingRepository<LangPopular, Long> {
}
