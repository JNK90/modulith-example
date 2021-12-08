import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ContextAComponent } from './context-a/context-a.component';
import { Route, RouterModule } from '@angular/router';

const routes: Route[] = [
  {
    path: '',
    component: ContextAComponent
  }
];

@NgModule({
  imports: [CommonModule, RouterModule.forChild(routes)],
  declarations: [
    ContextAComponent
  ],
  exports: [
    ContextAComponent
  ],
})
export class ContextAModule {}
