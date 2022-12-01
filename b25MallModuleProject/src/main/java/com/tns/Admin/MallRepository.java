package com.tns.Admin;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.Admin.Mall;
@Repository
public interface MallRepository extends JpaRepository < Mall, Integer>
{

}
