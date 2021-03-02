import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-mensaje`
 *
 * VistaMensaje element.
 *
 * @customElement
 * @polymer
 */
class VistaMensaje extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-mensaje';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensaje.is, VistaMensaje);
