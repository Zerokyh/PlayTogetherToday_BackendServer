package playtotogerther.API.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import playtotogerther.API.model.MemberFriendList;

import java.util.List;

public interface MemberFriendListRepository extends JpaRepository<MemberFriendList, Integer> {
    //특정 멤버의 친구리스트 가져오기
    @Query("SELECT mfl, mi.member_anniversary, gi.group_name FROM MemberFriendList mfl " +
            "JOIN MemberInfo mi ON mfl.friend_member_id = mi.member_id " +
            "LEFT JOIN GroupInfo gi ON mfl.friend_1st_group_id = gi.group_id " +
            "WHERE mfl.member_id = :member_id")
    List<Object[]> findFriendsByMemberId(@Param("member_id") int member_id);

}
