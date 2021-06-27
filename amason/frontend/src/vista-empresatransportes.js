import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaEmpresatransportes extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" id="menu-header" style="align-self: center;"></vaadin-vertical-layout>
 <vaadin-tabs orientation="horizontal" selected="0">
  <vaadin-tab selected>
    Tab one 
  </vaadin-tab>
  <vaadin-tab>
    Tab two 
  </vaadin-tab>
  <vaadin-tab>
    Tab three 
  </vaadin-tab>
 </vaadin-tabs>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-empresatransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresatransportes.is, VistaEmpresatransportes);
