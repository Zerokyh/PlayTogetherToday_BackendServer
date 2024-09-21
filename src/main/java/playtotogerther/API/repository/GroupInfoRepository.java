package playtotogerther.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import playtotogerther.API.model.GroupInfo;

import java.util.List;

public interface GroupInfoRepository extends JpaRepository<GroupInfo, Integer> {
    // 특정 멤버가 속한 그룹 정보 가져오기
    @Query("SELECT gi FROM GroupInfo gi JOIN GroupMemberMatch gmm ON gi.group_id = gmm.group_id WHERE gmm.member_id = :member_id")
    List<GroupInfo> findGroupsByMemberId(int member_id);


}
