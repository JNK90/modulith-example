import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ContextBComponent } from './context-b/context-b.component';
import { Route, RouterModule } from '@angular/router';

const routes: Route[] = [
  {
    path: '',
    component: ContextBComponent
  }
];

@NgModule({
  imports: [CommonModule, RouterModule.forChild(routes)],
  declarations: [
    ContextBComponent
  ],
  exports: [
    ContextBComponent
  ],
})
export class ContextBModule {}
