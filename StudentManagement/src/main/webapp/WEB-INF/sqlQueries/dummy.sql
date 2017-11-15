SELECT studentbean.parentid, parentbean.fatherfirstname, studentbean.firstname FROM studentbean INNER JOIN parentbean ON studentbean.parentid=parentbean.parentid;



SELECT studentbean.addressid, studentbean.dateOfBirth, studentbean.firstname, addressbean.residential_address FROM studentbean INNER JOIN addressbean ON studentbean.addressid=addressbean.addressid;