package playtotogerther.API.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import playtotogerther.API.model.MemberInfo;

public interface MemberInfoRepository extends JpaRepository<MemberInfo, Integer> {
}
