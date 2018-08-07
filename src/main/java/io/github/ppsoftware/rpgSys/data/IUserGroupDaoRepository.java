package io.github.ppsoftware.rpgSys.data;
import org.springframework.data.repository.CrudRepository;
import io.github.ppsoftware.rpgSys.model.UserGroupDao;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

@Component
public interface IUserGroupDaoRepository extends CrudRepository<UserGroupDao, Long>, JpaSpecificationExecutor<UserGroupDao>  {

}
