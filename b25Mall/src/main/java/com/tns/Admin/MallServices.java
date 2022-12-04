package com.tns.Admin;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tns.Admin.Mall;
import com.tns.Admin.MallRepository;
@Service
@Transactional
public class MallServices {

@Autowired
private MallRepository repo;

public List<Mall> listAll()
{

return repo.findAll();
}

public Mall get(Integer id) {
// TODO Auto-generated method stub
return repo.findById(id).get();
}

public void save(Mall mall) {
// TODO Auto-generated method stub
repo.save(mall);
}

public void delete(Integer id) {
// TODO Auto-generated method stub
repo.deleteById(id);
}

}


