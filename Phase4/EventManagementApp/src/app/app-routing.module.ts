import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListEmpComponent } from './list-emp/list-emp.component';
import { AddEmpComponent } from './add-emp/add-emp.component';
import { EditEmpComponent } from './edit-emp/edit-emp.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { EmpDetailComponent } from './emp-detail/emp-detail.component';
import { AdminEditComponent } from './admin-edit/admin-edit.component';
import { DashboardComponent } from './dashboard/dashboard.component';
const routes: Routes = [
  { path: '', component:AdminComponent  },
  { path: 'detail', component:EmpDetailComponent  },
  { path: 'dash', component:DashboardComponent },
  { path: 'admin', component:AdminEditComponent  },
  {path: 'home', component:HomeComponent  },
  { path: 'list-emp', component: ListEmpComponent },
  { path: 'add-emp', component: AddEmpComponent },
  { path: 'update-emp', component: EditEmpComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
