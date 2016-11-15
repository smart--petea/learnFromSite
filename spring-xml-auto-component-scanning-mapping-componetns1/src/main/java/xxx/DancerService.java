package xxx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DancerService {
    @Autowired
    private DancerDao dancerDao;

    public String doDance() {
        return dancerDao.doDance();
    }
}
