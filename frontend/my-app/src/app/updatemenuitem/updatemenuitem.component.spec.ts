import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatemenuitemComponent } from './updatemenuitem.component';

describe('UpdatemenuitemComponent', () => {
  let component: UpdatemenuitemComponent;
  let fixture: ComponentFixture<UpdatemenuitemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdatemenuitemComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UpdatemenuitemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
