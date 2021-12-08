import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContextBComponent } from './context-b.component';

describe('ContextBComponent', () => {
  let component: ContextBComponent;
  let fixture: ComponentFixture<ContextBComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContextBComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContextBComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
