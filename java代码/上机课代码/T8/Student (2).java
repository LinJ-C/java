
	class Student{


			String id;

			String name;

			int age;

			char sex;



			Student(String a,String b,int c,char d){


					 id = a;

					 name = b;
					
					age = c;

					sex = d;

					


			}


			Student(String a,String b){


					id = a;
	
					name  = b;

			}
			

			

	
			int findScore(String course_name){


				if(course_name.equals("����")){


					return 60;
				}

				else if(course_name.equals("��ѧ")){


					return 70;

				}

				else{


					return 80;
				}


				

					



			}


			boolean selectCourse(String course_name){



					if(course_name.equals("����")){ 

						return false;
					}
					else
					{

					  return true;

					}

				


				}


			String findShedule(){


				return "��һ:����;�ܶ�:��ѧ;...";



			}
			




	}