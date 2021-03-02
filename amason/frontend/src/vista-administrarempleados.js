import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-administrarempleados`
 *
 * VistaAdministrarempleados element.
 *
 * @customElement
 * @polymer
 */
class VistaAdministrarempleados extends PolymerElement {

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
        return 'vista-administrarempleados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarempleados.is, VistaAdministrarempleados);
